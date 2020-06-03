package exam.paperContext.domain.model.quizbank;

import exam.paperContext.domain.shared.Entity;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuizBank implements Entity<QuizBank> {
    @Override
    public boolean sameIdentityAs(QuizBank other) {
        return quizBankId.equals(other.GetQuizBankId());
    }

    public String GetQuizBankId() {
        return this.quizBankId;
    }

    private QuizBank(String quizBankId) {
        this.quizBankId = quizBankId;
        createTime = LocalDateTime.now();
    }

    private String quizBankId;
    private LocalDateTime createTime;
}
