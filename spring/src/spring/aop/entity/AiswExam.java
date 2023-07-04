package spring.aop.entity;

public class AiswExam implements Exam {

	private int kor;
	private int eng;
	private int math;

	@Override
	public int total() {
		
		// 주업무
		int result = kor + eng + math;
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		float result = (float) (total() / 3);
		return result;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "AiswExam [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public AiswExam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AiswExam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

}