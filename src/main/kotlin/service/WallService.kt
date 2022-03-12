package service

import exception.PostNotFoundException
import post.Comment
import post.Post

object WallService {
    var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()

    private var id: Int = 0

    fun add(post: Post): Post {
        id++
        post.id = id
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
       for ((index, foundPost) in posts.withIndex()){
           if(foundPost.id == post.id){
               posts[index] = foundPost.copy(ownerId = foundPost.ownerId, date = foundPost.date)
               return true
           }
       }
        return false
    }

    fun createComment(comment: Comment) {
        for(foundPost in posts){
            if(foundPost.id == comment.postId){
                comments += comment
                return
            } else {
                throw PostNotFoundException("Пост с id = " + comment.postId + " не найден")
            }
        }
    }
}