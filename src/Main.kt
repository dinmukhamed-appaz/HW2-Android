fun main() {
    val song = Song("Shape of You", "Ed Sheeran", 2017, 1500)

    song.describeSongs()
    println(song.isPopular())
}

class Song(val name: String, val artist: String, val year: Int, val count: Int) {
    fun isPopular(): Boolean {
        if (count < 1000) return false
        else return true
    }

    fun describeSongs() {
        println("$name, performed by $artist, was released in $year.")
    }
}