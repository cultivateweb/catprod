-- truncate table Producers
-- truncate table Categories
-- truncate table Products

insert into Producers values
  (1, 'samsung', 'Samsung', ''),
  (2, 'lg',      'LG',      ''),
  (3, 'philips', 'Philips', ''),
  (4, 'sony',    'Sony',    ''),
  (5, 'apple',   'Apple',   ''),
  (6, 'xiaomi',  'Xiaomi',  '');

insert into Categories values
  (1, null, 0, 'krupnaya-bytovaya-tekhnika', 'Крупная бытовая техника', 'https://comfy.ua/media/cms/cat_1/xholod.png.pagespeed.ic.1QwGG5A1_U.webp'),
  (2, null, 0, 'melkaya-bytovaya-tekhnika',  'Мелкая бытовая техника',  'https://comfy.ua/media/cms/cat_1/xpilesos.png.pagespeed.ic.ZmqI9xwWyA.webp'),
  (3, null, 0, 'televizory-i-aksessuary',    'Телевизоры и аксессуары', 'https://comfy.ua/media/cms/xtv.png.pagespeed.ic.RB-ioyEpiM.webp'),
  (4,    1, 1, 'kholodilniki',               'Холодильники',            'https://comfy.ua/media/cms/cat_1/xholod.png.pagespeed.ic.1QwGG5A1_U.webp'),
  (5,    1, 1, 'stiralnyye-mashiny',         'Стиральные машины',       'https://comfy.ua/media/cms/cat_1/xstiral.png.pagespeed.ic.QupaTPXVDY.webp'),
  (6,    1, 1, 'gazovyye-plity',             'Газовые плиты',           'https://comfy.ua/media/cms/cat_1/xplita.png.pagespeed.ic.nTLJJPwZ45.webp'),
  (7,    2, 1, 'pylesosy',                   'Пылесосы',                'https://comfy.ua/media/cms/cat_1/xpilesos.png.pagespeed.ic.ZmqI9xwWyA.webp'),
  (8,    2, 1, 'elektrochayniki',            'Электрочайники',          'https://comfy.ua/media/cms/cat_5/xelectric_teapots.png.pagespeed.ic.g2z24ERB3M.webp'),
  (9,    3, 1, 'televizory',                 'Телевизоры',              'https://comfy.ua/media/cms/xtv.png.pagespeed.ic.RB-ioyEpiM.webp'),
  (10,   3, 1, 'akustika-hifi',              'Акустика Hi-Fi',          'https://comfy.ua/media/cms/cat_2/xportkolonka.png.pagespeed.ic.BtP6xhFj91.webp'),
  (11,   3, 1, 'domashniye-kinoteatry',      'Домашние кинотеатры',     'https://comfy.ua/media/cms/cat_1/Home_theaters.png'),
  (12,   3, 1, 'dvd-hd-mediapleyery',        'DVD/HD-медиаплееры',      'https://comfy.ua/media/cms/cat_1/xMedia_Players.png.pagespeed.ic.JWIWfa7qm7.webp'),
  (13,   3, 1, 'aksessuary',                 'Аксессуары',              'https://comfy.ua/media/cms/cat_1/Accessories_for_Smart_TV.png');

insert into Products values
  (1, 1, 4, 'samsung-rt46k6340s8-ua', 'Холодильник Samsung RT46K6340S8/UA', 'https://cdn.comfy.ua/media/catalog/product/cache/4/small_image/270x265/62defc7f46f3fbfc8afcd112227d1181/i/m/img_0228_1.jpg',                14699.99, 'Объём холодильной камеры 223 л,  Класс энергопотребления: A++', true),
  (2, 1, 4, 'samsung-rb33j3201sa-ua', 'Холодильник Samsung RB33J3201SA/UA', 'https://cdn.comfy.ua/media/catalog/product/cache/4/small_image/270x265/62defc7f46f3fbfc8afcd112227d1181/_/s/_samsung_rb33j3201sa-ua_1.jpg', 14299.99, 'С морозильной камерой, Класс энергопотребления: A++',       false),
  (3, 2, 4, 'lg-rk6191aw',            'Холодильник LG RK 6191 AW',          'https://cdn.comfy.ua/media/catalog/product/cache/4/small_image/270x265/62defc7f46f3fbfc8afcd112227d1181/g/o/gorenje_rk_6191_aw.jpg',        10199.99, 'С нижней морозильной камерой, Класс энергопотребления: A+', true),
  (4, 2, 4, 'lg-ga-b429smqz',         'Холодильник LG GA-B429SMQZ',         'https://cdn.comfy.ua/media/catalog/product/cache/4/small_image/270x265/62defc7f46f3fbfc8afcd112227d1181/l/g/lg_ga-b429smqz.jpg',            14599.99, 'Система охлаждения морозильной камеры No Frost, Класс энергопотребления: A++', false);
