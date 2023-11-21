package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {

//	@NotNull(groups = UpdateCheck.class)
    private Long id;
    
//   @NotBlank(groups = {SaveCheck.class, UpdateCheck.class})
    private String itemName;
   
//   @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//   @Range(min = 1000, max = 1000000,groups = {SaveCheck.class, UpdateCheck.class})
    private Integer price;
   
//   @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//   @Max(value = 9999,groups = {SaveCheck.class})
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

/*
 * 검증 애노테이션
 * @NotBlank : 빈값 + 공백만 있는 경우를 허용하지 않는다.
 * @NotNull : null 을 허용하지 않는다.
 * @Range(min = 1000, max = 1000000) : 범위 안의 값이어야 한다.
 * @Max(9999) : 최대 9999까지만 허용한다.
 * 
 * 
 * */
