package com.sparta.springprepare;

import lombok.*;

@AllArgsConstructor // 모든 필드를 매개변수로 가지는 생성자를 만들어줌
@NoArgsConstructor // 기본 생성자 만들어줌
@RequiredArgsConstructor //final 이 달린 필드를 가지는 생성자를 만들어줌
@Getter //getter 만들어줌
@Setter //setter 만들어줌
public class Memo {
    private String username;
    private String contents;
}