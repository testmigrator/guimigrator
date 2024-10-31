package entity.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * eg:   @State private var selectedOption: Int?
 * eg:   @State private var agreeToTerms = false
 * var number: Int? = 42 //
 * var anotherNumber: Int? // nil
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TargetUIVar {

    /**
     * eg: @State
     */
    private String propertyWrapper;

    /**
     * eg: private
     */
    private String accessKey;

    private String varName;

    /**
     * optional, eg: Int?
     */
    private String varType;

    /**
     * optional, eg: 42
     */
    private String initValue;
}
