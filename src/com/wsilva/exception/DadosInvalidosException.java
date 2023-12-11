package com.wsilva.exception;

import java.io.Serial;

/**
 * @author rodrigo.pires
 */
public class DadosInvalidosException extends Exception {
    @Serial
    private static final long serialVersionUID = -1389494676398525746L;

    public DadosInvalidosException(String msg) {
        this(msg, null);
    }

    public DadosInvalidosException(String msg, Throwable e) {
        super(msg, e);
    }
}
