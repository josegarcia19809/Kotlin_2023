package k06_when_conditional

fun main(){
    val name="Luis"
    when (val length= name.length) {
        in 1..5-> println("A name with $length characters is short")
        in 6..10 -> println("A name with $length characters is medium")
        else -> println("A name with $length characters is long")
    }
}