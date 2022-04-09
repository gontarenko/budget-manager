package ru.gontarenko.feignclients.financeservice.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import ru.gontarenko.values.FinanceOperationType;
import ru.gontarenko.values.RepeatPeriod;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FinanceOperationDto {
    Long id;
    LocalDate date;
    String currencyCode;
    BigDecimal amount;
    FinanceOperationType type;
    RepeatPeriod repeatPeriod;
    String categoryName;
}