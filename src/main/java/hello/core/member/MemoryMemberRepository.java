package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
    // 여러군데에서 접근 할 수 있어서 동시성 문제 때문에 Concurrent HaspMap 써야함
    // 이 코드는 동시성 이슈가 발생할 수 있음
    private static Map<Long, Member> store = new HashMap<>();
    // 저장 구현
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }
    // 조회 구현
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
