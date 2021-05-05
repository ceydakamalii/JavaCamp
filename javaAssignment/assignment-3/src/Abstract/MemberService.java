package Abstract;

import Entities.Member;

public interface MemberService {
	void add(Member member) throws Exception;
	void update(Member member) throws Exception;
	void remove(Member member) throws Exception;

}
