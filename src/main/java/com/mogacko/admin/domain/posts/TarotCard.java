package com.mogacko.admin.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
//@Entity //Setter 메소드 만들 필요 없기때문에 Entity 메소드 사용 가능.
public class TarotCard {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String TAROT_CD;

    @Column(length=20, nullable = false)
    private String TAROT_NM;


    @Builder
    public TarotCard(String TAROT_CD, String TAROT_NM){
        this.TAROT_CD = TAROT_CD;
        this.TAROT_NM = TAROT_NM;
    }


}
