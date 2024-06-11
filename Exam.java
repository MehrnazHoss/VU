import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam {
    public String name;
    public int numberOfQuestion = 0;
    public String status;
    public double time;
    public Home home;
    public String[] questionsToString = new String[numberOfQuestion];
    public String[] answersToString = new String[numberOfQuestion];
    public JLabel[] questionsLabel = new JLabel[numberOfQuestion];
    public JLabel[] answersLabel = new JLabel[numberOfQuestion];

    public void innerQ(JTextArea[] exam){
        for (int i = 0; i < numberOfQuestion; i++){
            questionsToString[i] = exam[i].getText();
            questionsLabel[i].setSize(1350/numberOfQuestion,350);
            questionsLabel[i].setText(questionsToString[i]);
        }
    }
    public void innerA(JTextArea[] answer){
        for (int i = 0; i < numberOfQuestion; i++){
            answersToString[i] = answer[i].getText();
            answersLabel[i].setSize(1350/numberOfQuestion,350);
            answersLabel[i].setText(answersToString[i]);
        }
    }

    public void studentPage(){
        JFrame stuExamFrame = new JFrame();
        stuExamFrame.setSize(1600,900);
        JPanel[] question = new JPanel[20];
        JPanel[] answer = new JPanel[20];
        JTextArea[] textAnswer = new JTextArea[20];
        stuExamFrame.setLayout(new GridLayout(2,numberOfQuestion,20,10));
        for (int i = 0; i < numberOfQuestion; i++) {
            question[i] = new JPanel();
            question[i].setToolTipText("Question " + i+1);
            question[i].setSize(new Dimension(1400/numberOfQuestion, 400));
            question[i].setBackground(new Color(150, 150, 150));
            question[i].add(questionsLabel[i]);
            answer[i] = new JPanel();
            answer[i].setToolTipText("Answer " + i+1);
            answer[i].setSize(new Dimension(1400/numberOfQuestion, 400));
            answer[i].setBackground(new Color(200, 200, 200));
            answer[i].add(textAnswer[i]);
            stuExamFrame.add(question[i]);
        }
        JButton confirm = new JButton("Confirm answers");
        confirm.setBounds(350,800,200,75);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                innerA(textAnswer);
                home.studentList[home.studentCount-1].menu();
            }
        });
        stuExamFrame.add(confirm);
        stuExamFrame.setVisible(true);
    }

    public void professorPage(){
        JFrame profExamFrame = new JFrame();
        profExamFrame.setSize(1600,900);
        JPanel[] question = new JPanel[20];
        JTextArea[] textQuestion = new JTextArea[20];
        profExamFrame.setLayout(new GridLayout(1,numberOfQuestion));
        for (int i = 0; i < numberOfQuestion; i++) {
            question[i] = new JPanel();
            question[i].setSize(new Dimension(1400/numberOfQuestion, 400));
            question[i].setBackground(new Color(200, 200, 200));
            textQuestion[i] = new JTextArea();
            textQuestion[i].setSize(new Dimension(1300/numberOfQuestion,300));
            question[i].add(textQuestion[i]);
            profExamFrame.add(question[i]);
        }
        JButton confirm = new JButton("Confirm questions");
        confirm.setBounds(350,800,200,75);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                innerQ(textQuestion);
                home.professorList[home.professorCount-1].menu();
            }
        });
        profExamFrame.add(confirm);
        profExamFrame.setVisible(true);
    }

    public void professorPageForCorrection(){
        // بعد از اینکه دانشجو دکمه "تایید جواب ها" زد ، باید دکمه ای مخصوصا این دانشجو در صفحه سوالاتی که پروفسور ساخته ظاهر شود، تا استاد با کلیک بر روی آن بتواند به هر سوال نمره ای بدهد.
    }
}