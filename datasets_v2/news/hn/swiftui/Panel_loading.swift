import SwiftUI

struct Panel_loading: View {
  var body: some View {
    Text("Loading …").font(.system(size: 26)).foregroundColor(Color(red: 0.7647058823529411, green: 0.7098039215686275, blue: 0.6549019607843137, opacity: 1)).multilineTextAlignment(.center).background(Color(red: 1, green: 0.9294117647058824, blue: 0.8588235294117647, opacity: 1)).frame(maxWidth: .infinity, alignment: .center)
  }
}

struct Panel_loading_Previews: PreviewProvider {
  static var previews: some View {
    Panel_loading()
  }
}
