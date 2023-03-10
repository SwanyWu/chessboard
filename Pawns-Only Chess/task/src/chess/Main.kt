package chess


//    write your code here

fun main() {
    val gameName = "Pawns-Only Chess"
    val getName = "Player's name:"
    val pawnsChess = PawnsChess(getString("$gameName\nFirst $getName"), getString("Second $getName"))
    var command = ""
    val getCommand = { command = getString("${pawnsChess.currentPlayer()}'s turn:"); command }

    pawnsChess.printChessboard()
    /*
        while (!pawnsChess.gameOver && getCommand() != "exit") {
            if (pawnsChess.movePawn(command)) pawnsChess.printChessboard()
        }
        if (pawnsChess.gameOver) println(pawnsChess.gameOverMessage)
        println("Bye!")
 */

//        while (getCommand() != "exit") {
//            if (pawnsChess.movePawn(command)) pawnsChess.isWhitePawn = !pawnsChess.isWhitePawn
//            else println("Invalid Input")
//        }
//        println("Bye!")

    while (getCommand() != "exit") {
        if (pawnsChess.movePawn(command)) {
            pawnsChess.printChessboard()
            pawnsChess.isWhitePawn = !pawnsChess.isWhitePawn
        }
        else {
            println(pawnsChess.invalid)
            pawnsChess.invalid = "Invalid Input"
        }
    }
    println("Bye!")

}


private fun getString(message: String): String {
    println(message)
    return readln()
}

/*
fun main() {
val gameName = "Pawns-Only Chess"
println(gameName)

val getName = "Player's name:"
getString("$gameName\nFirst $getName")
getString("Second $getName")



//    print the chess board
/*
[
i=0 [_,_,_,_,_,_,_,_],
i=1 [w,w,w,w,w,w,w,w],
...
i=6 [b,b,b,b,b,b,b,b],
i=7 [_,_,_,_,_,_,_,_]
]
*/
val chessboard = Array(8) { i -> Array(8) { if (i == 1) 'w' else if (i == 6) 'b' else ' ' } }
val line = "  +---+---+---+---+---+---+---+---+"
val end = "    a   b   c   d   e   f   g   h\n"

println(line)
for (i in chessboard.indices.reversed()) {
    print("${i + 1} |")
    for (j in chessboard.indices) print(" ${chessboard[i][j].uppercaseChar()} |")
    println("\n" + line)
}
println(end)


}
*/
