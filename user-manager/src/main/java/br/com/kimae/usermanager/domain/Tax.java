package br.com.kimae.usermanager.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Tax {
    private final String name;
    private final BigDecimal value;
}
