package bsuir.VT.Lobyak.controller.command.user;

import bsuir.VT.Lobyak.controller.command.Command;
import bsuir.VT.Lobyak.controller.command.CommandResult;
import bsuir.VT.Lobyak.entity.Room;
import bsuir.VT.Lobyak.exception.ServiceException;
import bsuir.VT.Lobyak.service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MainPageCommand implements Command {

    private static final String MAIN_PAGE = "/WEB-INF/pages/makeOrder.jsp";
    private static final String ROOM_LIST = "roomList";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        RoomService roomService = new RoomService();
        List<Room> freeRoomList = roomService.findFree();
        request.setAttribute(ROOM_LIST, freeRoomList);
        return CommandResult.forward(MAIN_PAGE);
    }
}
