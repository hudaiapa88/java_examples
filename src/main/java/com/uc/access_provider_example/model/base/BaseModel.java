package com.uc.access_provider_example.model.base;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.NONE)
/**{code}
 * @Author Hüdai APA
 *
 */
public class BaseModel {

    private Integer id;
}
