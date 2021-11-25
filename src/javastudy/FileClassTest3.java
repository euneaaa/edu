import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileClassTest3 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c = in.read();//처음 1바이트 읽기
            //파일이 끝나면 -1을 반환.
            while (c!=-1){//파일이 끝나지 않았다면
                System.out.println((char)c);
                out.write(c);
                c = in.read(); //다시 1바이트 읽기
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(in != null)
                    in.close();
                if(out != null)
                    out.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
