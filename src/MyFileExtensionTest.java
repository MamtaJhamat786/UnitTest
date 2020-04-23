import static org.junit.Assert.*;

public class MyFileExtensionTest {
  static void checkFileExtensionMatchesOrNot(){
    FileExtensionAnalyzer fileExtensionAnalyzer=new FileExtensionAnalyzer();
    assertEquals(true ,fileExtensionAnalyzer.isValidFileName("Mamta.ppt")); // test will pass as we are expecting true and it supposed tobe true as well
    assertEquals(false ,fileExtensionAnalyzer.isValidFileName("Mamta.DOC"));// test will pass as we are expecting true and it supposed tobe true as well
    //assertEquals(true ,fileExtensionAnalyzer.isValidFileName("Mamta.doc")); // will return true as well
    assertEquals(true ,fileExtensionAnalyzer.isValidFileName("Mamta.DOC")); //test will fail and will throw an exception as we are expecting true and it supposed tobe false
    assertEquals(false ,fileExtensionAnalyzer.isValidFileName("vitaly.ppt")); //test will fail and will throw an exception as we are expecting false and it supposed tobe true



  }

}
