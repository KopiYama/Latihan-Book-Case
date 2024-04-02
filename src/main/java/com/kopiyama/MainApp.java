package com.kopiyama;

import com.kopiyama.repository.RepositoryBook;
import com.kopiyama.service.impl.AuthorServiceImpl;
import com.kopiyama.service.impl.BookServiceImpl;
import com.kopiyama.service.impl.PublisherServiceImpl;
import com.kopiyama.view.MainView;

public class MainApp {
    public static void main(String[] args) {
        RepositoryBook repositoryBook = new RepositoryBook();
        BookServiceImpl bookService = new BookServiceImpl(repositoryBook);
        AuthorServiceImpl authorService = new AuthorServiceImpl(repositoryBook);
        PublisherServiceImpl publisherService = new PublisherServiceImpl(repositoryBook);
        MainView mainView = new MainView(bookService, authorService, publisherService);

        mainView.showMainMenu();
    }
}
