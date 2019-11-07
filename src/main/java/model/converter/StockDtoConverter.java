package model.converter;

import model.dto.StockDto;
import model.entity.Stock;

public class StockDtoConverter {

    public Stock convertToEntity(StockDto stockDto) {
        UserDtoConverter userDtoConverter = new UserDtoConverter();

        return Stock.builder()
                .name(stockDto.getName())
                .user(userDtoConverter.convertToEntity(stockDto.getUser()))
                .numberOfStocks(stockDto.getNumberOfStocks())
                .build();
    }
}
