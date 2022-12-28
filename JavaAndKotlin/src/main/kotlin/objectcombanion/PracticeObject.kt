package objectcombanion

class PracticeObject {
    companion object{
        @JvmStatic
        var name:String ="sheik"
    }
    object friend{
        var age = 24
    }
}
object man{
    var dob :String = "123456"
}