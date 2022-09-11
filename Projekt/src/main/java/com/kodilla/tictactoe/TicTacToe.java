package com.kodilla.tictactoe;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class TicTacToe extends Application {

    private boolean playable = true;
    private boolean turnX = true;
    private Tile[][] board = new Tile[3][3];
    private List<IsWin> winOptions = new ArrayList<>();
    Label label = new Label("TURN X");

    Button buttonReset = new Button();
    private Pane root = new Pane();

    private Parent createContent() {
        root.setPrefSize(600, 800);
        label.setLayoutX(230);
        label.setLayoutY(620);
        label.setFont(Font.font(40));
        buttonReset.setText("New Game");
        buttonReset.setLayoutX(230);
        buttonReset.setLayoutY(700);
        buttonReset.setStyle("-fx-font-size: 2em; ");
        buttonReset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().clear();
                if(turnX==false){
                    label.setText("TURN O");
                }
                else{
                    label.setText("TURN X");}
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Tile tile = new Tile();
                        tile.setTranslateX(j * 200);
                        tile.setTranslateY(i * 200);
                        root.getChildren().add(tile);
                        board[j][i] = tile;
                    }
                }
                root.getChildren().addAll(buttonReset, label);
                playable = true;
                winOptions.clear();
                for (int y = 0; y < 3; y++) {
                    winOptions.add(new IsWin(board[0][y], board[1][y], board[2][y]));
                }
                for (int x = 0; x < 3; x++) {
                    winOptions.add(new IsWin(board[x][0], board[x][1], board[x][2]));
                }
                winOptions.add(new IsWin(board[0][0], board[1][1], board[2][2]));
                winOptions.add(new IsWin(board[2][0], board[1][1], board[0][2]));

            }
        });
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Tile tile = new Tile();
                tile.setTranslateX(j * 200);
                tile.setTranslateY(i * 200);
                root.getChildren().add(tile);
                board[j][i] = tile;
            }
        }
        for (int y = 0; y < 3; y++) {
            winOptions.add(new IsWin(board[0][y], board[1][y], board[2][y]));
        }

        for (int x = 0; x < 3; x++) {
            winOptions.add(new IsWin(board[x][0], board[x][1], board[x][2]));
        }
        winOptions.add(new IsWin(board[0][0], board[1][1], board[2][2]));
        winOptions.add(new IsWin(board[2][0], board[1][1], board[0][2]));
        root.getChildren().addAll(buttonReset, label);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.setTitle("Tic Tac Toe Game");
        primaryStage.show();
    }

    private void checkState() {
        for (IsWin combo : winOptions) {
            if (combo.isComplete()) {
                playable = false;
                if(turnX==false){
                    label.setText("X WIN");
                }
                else{
                    label.setText("O WIN");}
                break;
            }
        }
    }

    private class IsWin {

        private Tile[] tiles;

        public IsWin(Tile... tiles) {
            this.tiles = tiles;
        }

        public boolean isComplete() {
            if (tiles[0].getValue().isEmpty()) {
                return false;
            }
            return tiles[0].getValue().equals(tiles[1].getValue())
                    && tiles[0].getValue().equals(tiles[2].getValue());
        }
    }

    private class Tile extends StackPane {

        private Text text = new Text();

        public Tile() {
            Rectangle border = new Rectangle(200, 200);
            border.setFill(null);
            border.setStroke(Color.BLACK);
            border.setStrokeWidth(2);
            text.setFont(Font.font(92));
            setAlignment(Pos.CENTER);
            getChildren().addAll(border, text);

            setOnMouseClicked(event -> {
                if (!playable) {
                    return;
                }
                if (event.getButton() == MouseButton.PRIMARY) {
                    if (!turnX || text.getText() == "O" || text.getText() == "X") {
                        return;
                    }
                    drawX();
                    turnX = false;
                    label.setText("TURN O");
                    checkState();
                } else if (event.getButton() == MouseButton.SECONDARY) {
                    if (turnX || text.getText() == "O" || text.getText() == "X") {
                        return;
                    }
                    drawO();
                    turnX = true;
                    label.setText("TURN X");
                    checkState();
                }
            });
        }
        public String getValue() {
            return text.getText();
        }
        private void drawX() {
            text.setText("X");
            text.setFill(Color.BLACK);
        }

        private void drawO() {
            text.setText("O");
            text.setFill(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

