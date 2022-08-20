class FileIO {

    static void main(String[] args){

//        new File("D:/IntelliJ/Projects/GroovyProj_1/src/text.txt").eachLine {
//            line -> println line
//        }

//        new File("D:/IntelliJ/Projects/GroovyProj_1/src/text.txt").withWriter {
//            writer -> writer.writeLine("line4");
//        }

        File file = new File("D:/IntelliJ/Projects/GroovyProj_1/src/text.txt")
        file.append("This is the appended line 5\n")

        println "file.text: " + file.text

        println "File length is: ${file.length()} bytes"
        println "file.size(): " + file.size()

        println "file.isFile(): " + file.isFile()
        println "file.isDirectory(): " + file.isDirectory()

//        def newFile = new File("D:/IntelliJ/Projects/GroovyProj_1/src/text2.txt")
//        newFile << file.text
//        newFile.delete()

        def dirFiles = new File("").listRoots()
        println "dirFiles: " + dirFiles

        dirFiles.each {item -> println item}
        dirFiles.each {item -> println file.absolutePath}
    }
}
