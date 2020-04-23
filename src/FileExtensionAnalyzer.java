public class FileExtensionAnalyzer {
  public boolean isValidFileName(String fileName)
  {
    if(fileName.endsWith(".DOC"))
    {
      return false;
    }
    return true;
  }
}
