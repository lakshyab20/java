import java.awt.image.BufferedImage; 
import java.io.File; 
import java.io.IOException; 
import javax.imageio.ImageIO;
  
class LoadingImage_JSE_library{
   public static void main( String[] args ) throws IOException {
      //Input File 
      File input = new File("C:/EXAMPLES/OpenCV/sample.jpeg");
          
      //Reading the image 
      BufferedImage image = ImageIO.read(input);
      
      //Saving the image with a different name
      File ouptut = new File("C:/OpenCV/sample.jpeg");
      ImageIO.write(image, "jpeg", ouptut);
         
      System.out.println("image Saved");
   } 
}