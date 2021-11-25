import java.io.*;

public class FileClassTest2 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

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
