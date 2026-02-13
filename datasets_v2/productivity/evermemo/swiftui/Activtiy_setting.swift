import SwiftUI

struct Activtiy_setting: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Rectangle().foregroundColor(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
      .background(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
      .frame(height: 1.0)
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Image("ic_evernote").resizable().scaledToFit().frame(width: 25.0, height: 25.0).frame(maxHeight: .infinity, alignment: .center)
          Text("Connect").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(.leading, 10.0).frame(maxHeight: .infinity, alignment: .center)
          Image("ic_rightarrow").resizable().scaledToFit().frame(width: 20.0, height: 20.0).frame(maxHeight: .infinity, alignment: .center)
        }
        .background(Color(red: 0.9058823529411765, green: 0.9058823529411765, blue: 0.9058823529411765, opacity: 1))
        .frame(maxWidth: .infinity)
        .frame(height: 55.0)
        Rectangle().foregroundColor(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
        .background(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
        .frame(height: 1.0)
        HStack(alignment: .center, spacing: 0) {
          Image("ic_start").resizable().scaledToFit().frame(width: 25.0, height: 25.0).frame(maxHeight: .infinity, alignment: .center)
          Text("New memo when start-up").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(.leading, 10.0).frame(maxHeight: .infinity, alignment: .center)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          }
          .frame(maxHeight: .infinity, alignment: .center)
        }
        .background(Color(red: 0.9058823529411765, green: 0.9058823529411765, blue: 0.9058823529411765, opacity: 1))
        .frame(maxWidth: .infinity)
        .frame(height: 55.0)
        Rectangle().foregroundColor(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
        .background(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
        .frame(height: 1.0)
        HStack(alignment: .center, spacing: 0) {
          Image("ic_heart").resizable().scaledToFit().frame(width: 25.0, height: 25.0).frame(maxHeight: .infinity, alignment: .center)
          Text("Rate for us").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(.leading, 10.0).frame(maxHeight: .infinity, alignment: .center)
          Image("ic_rightarrow").resizable().scaledToFit().frame(width: 20.0, height: 20.0).frame(maxHeight: .infinity, alignment: .center)
        }
        .background(Color(red: 0.9058823529411765, green: 0.9058823529411765, blue: 0.9058823529411765, opacity: 1))
        .frame(maxWidth: .infinity)
        .frame(height: 55.0)
        Rectangle().foregroundColor(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
        .background(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
        .frame(height: 1.0)
      }
      .frame(maxWidth: .infinity)
      Text("Proudly made by Mudlab9nCoded by Daimajia,Designed by Plidezusnmade in Beijing&Shanghai").font(.system(size: 11)).foregroundColor(Color(red: 0.49411764705882355, green: 0.49411764705882355, blue: 0.49411764705882355, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.bottom, 15.0)
    }
    .background(Color(red: 0.9058823529411765, green: 0.9058823529411765, blue: 0.9058823529411765, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activtiy_setting_Previews: PreviewProvider {
  static var previews: some View {
    Activtiy_setting()
  }
}
