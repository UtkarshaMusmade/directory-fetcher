import org.scalatest.WordSpec

class FolderTestCases extends WordSpec {

val folder = new Folder[String]("/directory-content-fetcher")

  "List of Files" should {
    "compare lists" in {
      assert(folder.listOfFiles == List())
    }

  }


}
