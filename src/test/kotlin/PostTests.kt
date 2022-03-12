import exception.PostNotFoundException
import org.junit.Assert.*
import org.junit.Test
import post.Comment
import post.Post
import service.WallService

class PostTests {

    @Test
    fun add_test() {
        val post = Post()
        val expected = 1
        WallService.add(post)
        val actual = post.id
        assertEquals(actual, expected)
    }

    @Test
    fun update_success_test() {
        val post = Post()
        post.id = 1
        WallService.add(post)
        val actual = WallService.update(post)
        assertTrue(actual)
    }

    @Test
    fun update_fail_test() {
        val post = Post()
        post.id = 20
        val actual = WallService.update(post)
        assertFalse(actual)
    }

    @Test(expected = PostNotFoundException::class)
    fun create_comment_exception_test(){
        val comment = Comment()
        comment.postId = 33
        WallService.createComment(comment)
    }

    @Test
    fun create_comment_success_test(){
        val post = Post()
        WallService.add(post)
        val comment = Comment()
        comment.postId = 1
        WallService.createComment(comment)
        val expected = 1
        val actual = WallService.comments.size
        assertEquals("Количество комментариев не увеличилось", expected, actual)
    }
}