import org.testng.Assert.*
import org.testng.annotations.Test
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
}