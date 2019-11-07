package model.converter;

import model.dto.RequestDto;
import model.entity.Request;

public class RequestDtoConverter {

    public Request convertToEntity(RequestDto requestDto) {
        UserDtoConverter userDtoConverter = new UserDtoConverter();

        return Request.builder()
                .stockName(requestDto.getStockName())
                .user(userDtoConverter.convertToEntity(requestDto.getUser()))
                .numberOfStocks(requestDto.getNumberOfStocks())
                .price(requestDto.getPrice())
                .build();
    }

    public RequestDto convertFromEntity(Request request) {
        UserDtoConverter userDtoConverter = new UserDtoConverter();

        return RequestDto.builder()
                .publicId(request.getPublicIdentifier())
                .stockName(request.getStockName())
                .user(userDtoConverter.convertFromEntity(request.getUser()))
                .numberOfStocks(request.getNumberOfStocks())
                .build();
    }
}
