import java.io.File

class Folder(val givenFolder: String) {

  val file = new File(givenFolder)


  def listOfFiles(): List[String] = {
    val fileList: List[String] = List()

    def ff(fileList: List[String], fileName: File): List[String] = {
      if (!fileName.exists) fileList else {

        val files = fileName.listFiles

        for{
           file<-files
            file.getName
            } yeild namesoffiles

        val newFileList = filelist :+

          ff(newFileList, filename)
      }


    }

    val finalFileList= ff(fileList, file)
    finalFileList
  }


}

