# Generated by Django 4.1.6 on 2023-02-06 12:00

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('catalog', '0002_genre_remove_pelicula_director_remove_pelicula_genre_and_more'),
    ]

    operations = [
        migrations.AddField(
            model_name='pelicula',
            name='director',
            field=models.ManyToManyField(to='catalog.director'),
        ),
    ]
