package MyStudy;

import java.io.File;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
// https://www.delftstack.com/ko/howto/java/java-file-chooser/ 프로그램뜯어보기 공부
public class Rename {
    public static void main(String[] args) {
    	File_Chooser_Window();
    }

    private static void File_Chooser_Window() {
        JFrame  fcf = new JFrame("File Chooser");
        fcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Create_UI(fcf);
        fcf.setSize(400, 300); // 창넓이 높이 설정
        fcf.setLocationRelativeTo(null);
        fcf.setVisible(true);
    }

    private static void Create_UI(final JFrame fcf){
        JPanel File_Chooser_Panel = new JPanel();
        LayoutManager Layout_Manager = new FlowLayout();
        File_Chooser_Panel.setLayout(Layout_Manager);

        JButton Choose_Button = new JButton("Choose File"); //
        final JLabel J_Label = new JLabel();

        Choose_Button.addActionListener(new ActionListener() {
         @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser J_File_Chooser = new JFileChooser();
                J_File_Chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                int option = J_File_Chooser.showOpenDialog(fcf);
                if(option == JFileChooser.APPROVE_OPTION){
                    File file = J_File_Chooser.getSelectedFile();
                    J_Label.setText("Selected: " + file.getName());
                }
                else{
                	J_Label.setText("Command Canceled");
                }
            }
        });

        File_Chooser_Panel.add(Choose_Button);
        File_Chooser_Panel.add(J_Label);
        fcf.getContentPane().add(File_Chooser_Panel, BorderLayout.CENTER);
    }
 // http://202psj.tistory.com

 // JFileChooser 생성

    JFileChooser fileDlg1 = new JFileChooser();

     int result  = fileDlg1.showOpenDialog(null);
             if(result == JFileChooser.APPROVE_OPTION) //파일을 선택하고 열었을때 이벤트
             {





             }



 // 필터

 // 필터설정 png, jpg 다이렉트만 보이고 나머지는 않보이게 한다.

             fileDlg.setFileFilter(new javax.swing.filechooser.FileFilter() {
                
                 
                 public String getDescription() {
                     // TODO Auto-generated method stub
                     return null;
                 }
                
                 
                 public boolean accept(File f) {
                     // TODO Auto-generated method stub
                     String fileName = f.getName();

                     if(fileName.indexOf(".png") != -1)
                     {
                         return true;
                     }
                     else if(fileName.indexOf(".jpg") != -1)
                     {
                         return true;
                     }
                     else if(f.isDirectory())
                     {
                         return true;
                     }
                    
                     return false;
                 }
             
    
}


