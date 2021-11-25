import java.io.File;

public class FileClassTest {
    public static void main(String[] args) {
        String filePath = ".\\";//현재 경로
        //설정한 파일 경로로 파일 객체를 생성
        File f1 = new File(filePath);
        //현재 파일 경로에 있는 모든 파일과 폴더를 배열로 받아온다.
        String[] list=f1.list();
        //파일갯수, 폴더갯수만큼 for문 순회
        for(int i = 0; i<list.length; i++){
            //현재 파일 경로에서 해당 파일을 객체로 생성
            File f2 = new File(filePath, list[i]);
            if(f2.isDirectory()){//파일이 폴더인지 묻는다.
                System.out.println(list[i]+": 폴더");
            }else {
                System.out.printf("%s: 파일, %,dbyte\n",list[i], f2.length());
            }
        }
    }
}
