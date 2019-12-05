package project.justice.member;

public interface MemberImpl {
	public int userCheck(MemberVO vo) throws Exception;
	public void insertMember(MemberVO vo) throws Exception;
	public int confirmId(MemberVO vo) throws Exception;
	public MemberVO getMember(String id) throws Exception;
	public void updateMember(MemberVO vo) throws Exception;
	public int deleteMember(String id,String passwd) throws Exception;
}
