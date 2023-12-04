package hello.login.domain.login;

import org.springframework.stereotype.Service;

import hello.login.web.member.Member;
import hello.login.web.member.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginService {

	private final MemberRepository memberRepository;
	
	//로그인 한 아이디가 맞는지 틀린지 확인하기
	
	/*
	 * @Return null 이면 로그인 실패
	 * 
	 * */
	public Member login(String loginId,String password) {
		return memberRepository.findByLoginId(loginId)
				.filter(m -> m.getPassword().equals(password))
				.orElse(null);
		
	}
}
