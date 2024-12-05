package k10_poo_clases


/*
    A class KotlinCourse will provide Kotlin information. It will also provide some general
    information about the course without needing an object to be created.
    Implement this functionality in a program and display the general information.
 */
class KotlinCourse {
    fun getCourseInfo() {
        println("Kotlin is a Java based development language")
    }

    companion object {
        fun getCourseMetaInfo() {
            println("Kotlin is not a difficult language to learn")
        }
    }
}


fun main() {
    val kotlinCourse = KotlinCourse()
    kotlinCourse.getCourseInfo()
    KotlinCourse.getCourseMetaInfo()
}