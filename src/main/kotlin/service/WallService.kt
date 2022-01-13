package service

import post.Post

object WallService {
    var posts = emptyArray<Post>()
    private var id: Int = 0

    fun add(post: Post): Post {
        id++
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
}