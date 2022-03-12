package post

data class Comment(val id:Int = 1, val fromId:Int = 0, val date:Int = 0, val text:String = "", var postId:Int = 0) {
}