package p08.textbook.exercise.p4;

public class OracleDao implements DataAccessObject{
	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}
	@Override
	public void select() {
		System.out.println("MySql DB에서 선택");
	}
	@Override
	public void update() {
		System.out.println("MySql DB를 수정");
	}
}
