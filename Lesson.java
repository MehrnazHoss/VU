import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson {
    public String name;
    public Student[] lessonStudent=new Student[100];
    JFrame profFrame=new JFrame();
    JFrame stuFrame = new JFrame();
    JFrame officialFrame = new JFrame();
    public Home home;
    public Exam[] examList=new Exam[5];
    public Notif[] notifList=new Notif[10];
    public Content[] contentList=new Content[20];
    public Practice[] practiceList=new Practice[5];
    public void profLessonMenu(){
        profFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        profFrame.setSize(1600,900);
        profFrame.setLayout(null);
        JPanel studentPanel = new JPanel();
        studentPanel.setBounds(100,100,200,300);
        String[] list = {"stu1","stu2"};
        JComboBox stuListBox = new JComboBox(list);
        stuListBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(stuListBox.getSelectedItem());
            }
        });
        JButton back = new JButton("BACK");
        back.setBounds(100,600,100,70);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                home.professorList[home.professorCount].menu();
                profFrame.dispose();
            }
        });
        profFrame.add(back);
        studentPanel.add(stuListBox);

        JPanel examPanel=new JPanel();
        examPanel.setBounds(900,100,200,300);
        examPanel.setLayout(new GridLayout(6,1));
        JLabel exam=new JLabel("The List of Exams");
        examPanel.add(exam);
        /*for(int i=0;i<5;i++) {
            final int j=i;
            JButton examButton=new JButton(examList[i].name);
            if(examList[i]==null)examButton.setVisible(false);
            else{
                examButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        examList[j].page();
                    }
                });
            }
            examPanel.add(examButton);
        }*/
        JPanel practicePanel=new JPanel();
        practicePanel.setBounds(600,100,200,300);
        practicePanel.setLayout(new GridLayout(6,1));
        JLabel practice=new JLabel("The List of Practices");
        practicePanel.add(practice);
        /*for(int i=0;i<5;i++) {
            final int j=i;
            JButton practiceButton=new JButton(practiceList[i].name);
            // if(practiceList[i]==null)practiceButton.setVisible(false);
            //   else{
            practiceButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    practiceList[j].practicePage(frame);
                }
            });
            //    }
            practicePanel.add(practiceButton);
        }*/
        profFrame.add(studentPanel);
        profFrame.add(examPanel);
        profFrame.add(practicePanel);
        profFrame.setVisible(true);
    }

    public void stuLessonMenu(){
        stuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        stuFrame.setSize(1600,900);
        stuFrame.setLayout(null);
        JPanel examPanel=new JPanel();
        examPanel.setBounds(900,100,200,300);
        examPanel.setLayout(new GridLayout(6,1));
        JLabel exam=new JLabel("The List of Exams");
        examPanel.add(exam);
        /*for(int i=0;i<5;i++) {
            final int j=i;
            JButton examButton=new JButton(examList[i].name);
            if(examList[i]==null)examButton.setVisible(false);
            else{
                examButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        examList[j].studentPage();
                    }
                });
            }
            examPanel.add(examButton);
        }*/
        JPanel practicePanel=new JPanel();
        practicePanel.setBounds(600,100,200,300);
        practicePanel.setLayout(new GridLayout(6,1));
        JLabel practice=new JLabel("The List of Practices");
        practicePanel.add(practice);
        /*for(int i=0;i<5;i++) {
            final int j=i;
            JButton practiceButton=new JButton(practiceList[i].name);
            // if(practiceList[i]==null)practiceButton.setVisible(false);
            //   else{
            practiceButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    practiceList[j].practicePage(stuFrame);
                }
            });
            //    }
            practicePanel.add(practiceButton);
        }*/
        stuFrame.add(examPanel);
        stuFrame.add(practicePanel);
        stuFrame.setVisible(true);
    }

    public void officialLessonMenu(){
        officialFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        officialFrame.setSize(1600,900);
        officialFrame.setLayout(null);
        JPanel examPanel=new JPanel();
        examPanel.setBounds(900,100,200,300);
        examPanel.setLayout(new GridLayout(6,1));
        JLabel exam=new JLabel("The List of Exams");
        examPanel.add(exam);
        /*for(int i=0;i<5;i++) {
            final int j=i;
            JButton examButton=new JButton(examList[i].name);
            if(examList[i]==null)examButton.setVisible(false);
            else{
                examButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        examList[j].studentPage();
                    }
                });
            }
            examPanel.add(examButton);
        }*/
        JPanel practicePanel=new JPanel();
        practicePanel.setBounds(600,100,200,300);
        practicePanel.setLayout(new GridLayout(6,1));
        JLabel practice=new JLabel("The List of Practices");
        practicePanel.add(practice);
        /*for(int i=0;i<5;i++) {
            final int j=i;
            JButton practiceButton=new JButton(practiceList[i].name);
            // if(practiceList[i]==null)practiceButton.setVisible(false);
            //   else{
            practiceButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    practiceList[j].practicePage(stuFrame);
                }
            });
            //    }
            practicePanel.add(practiceButton);
        }*/
        officialFrame.add(examPanel);
        officialFrame.add(practicePanel);
        officialFrame.setVisible(true);
    }
}