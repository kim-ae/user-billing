package br.com.kimae.usermanager.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class Bill {

    private final String id;

    private final Map<System, BigDecimal> discriminatedValues;

    public final List<Tax> taxes;

    private final String total;
}
