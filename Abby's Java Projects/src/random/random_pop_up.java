package random;
import java.util.Random; 
import javax.swing.JOptionPane; 

public class random_pop_up {
	public static void main(String[] args) {
		String[] studentsname = new String[]{"Abby Truong","Ahmed Mujtaba", "Azeez Temitope Olanrewaju", 
		"Diming Chu", "Dongshuo Li", "Honorinicy", "Jason", "Junyu Liu", "Kelly Liu", 
		"Kinjan", "Kun Li" , "Muhammed Umar" , "Oaz" , "PQ" , "Prithviatani" , "Richard" , 
		"Sahil Slngh Sandhu", "Samuel Yang" , "Scott(Shi-Kai) Jhou" , "Shahbaz Mansahia" , 
		"Shahriar Kabir" , "Shakur" , "Shrina Patel" , "Siyu Qiu" , "Siyu Lei" , "Sumid", 
		"Tao" , "Trivediakshay" , "Yan Huang" , "Zhaosaitong"}; 
		Random studentslist = new Random();
		int random = studentslist.nextInt(studentsname.length);
		System.out.println(studentsname[random]);
		JOptionPane.showMessageDialog(null, studentsname[random], "", JOptionPane.INFORMATION_MESSAGE);
	}
}
