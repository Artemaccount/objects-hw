package post

data class Post(
    var id: Int = 1, val ownerId: Int = 1, val fromId: Int = 1, val createdBy: Int = 1,
    val date: Int = 1, val text: String = "", val replyOwnerId: Int = 1, val replyPostId: Int = 1,
    val friendsOnly: Boolean = true, val comments: Comments = Comments(), val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(), val reposts: Reposts = Reposts(), val views: Views = Views(), val postType: String = "",
    val signerId: Int = 1, val canPin: Boolean = true, val canDelete: Boolean = true, val canEdit: Boolean = true,
    val isPinned: Boolean = true, val markedAsAds: Boolean = true, val isFavorite: Boolean = true,
    val postPonedId: Int = 1
)