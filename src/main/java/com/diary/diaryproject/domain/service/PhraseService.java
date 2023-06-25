package com.diary.diaryproject.domain.service;

import com.diary.diaryproject.domain.aggregate.entity.Phrases;
import com.diary.diaryproject.domain.dto.PhraseDto;
import com.diary.diaryproject.domain.repository.PhrasesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PhraseService {

    private final PhrasesRepository phrasesRepository;

    @Transactional
    public void registPhraseToUser(String userId, String phrase) throws Exception {

        Phrases phrases = Phrases.builder()
                .userId(userId)
                .phrase(phrase)
                .createdDate(LocalDate.now())
                .build();

        phrasesRepository.save(phrases);
    }

    public PhraseDto findPhrase(String userId, LocalDate date) {
        PhraseDto phraseDto = new PhraseDto();
        Phrases phrases = phrasesRepository.findByUserIdAndDate(userId, date);
        phraseDto = phraseDto.toDto(phrases);

        return phraseDto;
    }
}
