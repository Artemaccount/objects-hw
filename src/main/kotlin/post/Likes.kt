package post

data class Likes(val count: Int = 1, val userLikes: Int = 1, val canLike: Boolean = true,
                 val canPublish: Boolean = true)
