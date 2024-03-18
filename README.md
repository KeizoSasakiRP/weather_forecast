## 簡易的な天気予報アプリ
下記の学習の意味を込めて、簡易的な天気予報Webアプリを作成した。

- APIの利用
- JSONデータの利用
- Webアプリの制作

## 利用したAPI

- OpenWeather
  - https://openweathermap.org/

## アプリ使用方法
※現時点ではサーバーへデプロイすることは考えていないため、local環境での動作のみ。(後々対応するかも？)
1. 上記のOpenWeatherAPIのアカウントを作成し、APIアクセストークンを作成する。
2. WeatherControllerのAPI_KEYに取得したアクセストークンを入れる。([こちら](https://github.com/KeizoSasakiRP/weather_forecast/blob/main/src/main/java/com/example/weather_forecast/controller/WeatherController.java#L24))
3. WeatherForecastApplication([こちら](https://github.com/KeizoSasakiRP/weather_forecast/blob/main/src/main/java/com/example/weather_forecast/WeatherForecastApplication.java))を実行。
4. ブラウザのURL入力欄に下記を入力。
  - http://localhost:8080/weather
5. 初期画面
![スクリーンショット 2024-03-18 22 39 43](https://github.com/KeizoSasakiRP/weather_forecast/assets/157101140/7633c909-33fe-44dc-b30a-106c6ac91b41)
6. 天気を見たい都市名を入力し、検索ボタンを押下。
![スクリーンショット 2024-03-18 22 40 37](https://github.com/KeizoSasakiRP/weather_forecast/assets/157101140/012a53e3-57c3-4026-8079-f141ded06296)
7. 天気予報の結果画面
![スクリーンショット 2024-03-18 22 42 00](https://github.com/KeizoSasakiRP/weather_forecast/assets/157101140/22f21ed0-3c6c-4240-83ad-b2305bdb0db3)

## 補足
現時点では入力チェックやデザインなどは実装していないため、今後の改良点として残しておく。(2024/03/18時点)
