{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyPwPbCu5LG2R3/kuzb6U6Z2",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/JuanSebastianSantos/PROGCOM-A/blob/main/main2.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "PJDk7jMyRdWL"
      },
      "outputs": [],
      "source": [
        "import java.util.*;\n",
        "\n",
        "public class Main {\n",
        "    public static void main(String[] args) {\n",
        "        List<Integer> doble = new ArrayList<>();\n",
        "        for (int i = 1; i <= 5; i++) {\n",
        "            doble.add(i * 2);\n",
        "        }\n",
        "        System.out.println(\"Doble de cada número del 1 al 5:\");\n",
        "        System.out.println(doble);\n",
        "    }\n",
        "}"
      ]
    }
  ]
}