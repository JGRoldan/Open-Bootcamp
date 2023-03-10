# Generated by Django 4.1.6 on 2023-02-06 11:40

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Director',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(help_text='Indica el nombre del Director', max_length=66)),
                ('last_name', models.CharField(max_length=100)),
            ],
        ),
        migrations.CreateModel(
            name='Pelicula',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('title', models.CharField(max_length=35)),
                ('summary', models.TextField(help_text='Sinopsis de la pelicula', max_length=100)),
                ('genre', models.CharField(help_text='Indica el genero de la pelicula', max_length=15, verbose_name='Genereo')),
                ('director', models.ManyToManyField(to='catalog.director')),
            ],
        ),
    ]
