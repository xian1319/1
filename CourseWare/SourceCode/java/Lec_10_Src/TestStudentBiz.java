public class TestStudentBiz {
	public static void main(String[] args) {
		StudentBiz td = new StudentBiz();
		try {
			td.readDate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//td.insertDateByName("�����", "02", 87);
//td.updateDateByName("zah");
