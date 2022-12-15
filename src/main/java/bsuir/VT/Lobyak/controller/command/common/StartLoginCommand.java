package bsuir.VT.Lobyak.controller.command.common;

import bsuir.VT.Lobyak.controller.command.Command;
import bsuir.VT.Lobyak.controller.command.CommandResult;
import bsuir.VT.Lobyak.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartLoginCommand implements Command {

    private static final String LOGIN_PAGE = "/WEB-INF/pages/login.jsp";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        return CommandResult.forward(LOGIN_PAGE);
    }
}
